//[app](../../../index.md)/[com.example.playgames.adapter](../index.md)/[AboutViewHolder](index.md)

# AboutViewHolder

[androidJvm]\
class [AboutViewHolder](index.md)(view: [View](https://developer.android.com/reference/kotlin/android/view/View.html)) : [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html)

Clase AboutViewHolder que extiende de RecyclerView.ViewHolder y recibe una vista como parámetro

## Constructors

| | |
|---|---|
| [AboutViewHolder](-about-view-holder.md) | [androidJvm]<br>constructor(view: [View](https://developer.android.com/reference/kotlin/android/view/View.html)) |

## Properties

| Name | Summary |
|---|---|
| [imagen](imagen.md) | [androidJvm]<br>val [imagen](imagen.md): [ImageView](https://developer.android.com/reference/kotlin/android/widget/ImageView.html) |
| [nombre](nombre.md) | [androidJvm]<br>val [nombre](nombre.md): [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html)<br>Elementos de la vista que se enlazan con los datos del objeto About |
| [numero](numero.md) | [androidJvm]<br>val [numero](numero.md): [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) |

## Functions

| Name | Summary |
|---|---|
| [render](render.md) | [androidJvm]<br>fun [render](render.md)(AboutStat: [About](../../com.example.playgames.model/-about/index.md))<br>Método que se llama para enlazar los datos del objeto About con los elementos de la vista |
