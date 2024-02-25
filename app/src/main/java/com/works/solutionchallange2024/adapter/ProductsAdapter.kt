import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.works.solutionchallange2024.R
import com.works.solutionchallange2024.model.retrofit.Advert
import com.works.solutionchallange2024.view.HomePageFragmentDirections

class ProductAdapter(private var productList: List<Advert>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName: TextView = itemView.findViewById(R.id.name_product)
        val productCategory: TextView = itemView.findViewById(R.id.category_product)
        val productImage: ImageView = itemView.findViewById(R.id.img_products)
        val productPoint: TextView = itemView.findViewById(R.id.point_product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.products_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        if (productList.isNullOrEmpty() || position >= productList.size) {
            Log.e("ProductAdapter", "Invalid product list or position: $position")
            return
        }

        val product = productList[position]
        Log.d("ProductAdapter", "Product name: ${product.tag}, Category: ${product.category}, Point: ${product.point}, Image URL: ${product.images.getOrNull(0)}")

        holder.productName.text = product.tag
        holder.productCategory.text = product.category
        holder.productPoint.text = product.point.toString()
        Picasso.get().load(product.images.getOrNull(0)).into(holder.productImage)

        holder.itemView.setOnClickListener {
            val transition = HomePageFragmentDirections.actionHomePageFragmentToProductBuyDetailFragment(product._id)
            Navigation.findNavController(it).navigate(transition)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newProductList: List<Advert>) {
        productList = newProductList
        notifyDataSetChanged()
    }
}