
import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdapter {

    companion object{
        @JvmStatic @BindingAdapter("imageResource")
        fun setImageResources(imageView: ImageView, resource: Int){
            imageView.setImageResource(resource)
        }
    }
}