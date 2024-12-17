//[app](../../../index.md)/[com.example.playgames.adapter](../index.md)/[AboutAdapter](index.md)

# AboutAdapter

[androidJvm]\
class [AboutAdapter](index.md)(aboutList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[About](../../com.example.playgames.model/-about/index.md)&gt;) : [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html)&lt;[AboutViewHolder](../-about-view-holder/index.md)&gt; 

Clase AboutAdapter que extiende de RecyclerView.Adapter y recibe una lista de objetos About como parámetro

## Constructors

| | |
|---|---|
| [AboutAdapter](-about-adapter.md) | [androidJvm]<br>constructor(aboutList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[About](../../com.example.playgames.model/-about/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [getItemCount](get-item-count.md) | [androidJvm]<br>open override fun [getItemCount](get-item-count.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Método que devuelve el número de elementos en la lista |
| [onBindViewHolder](on-bind-view-holder.md) | [androidJvm]<br>open override fun [onBindViewHolder](on-bind-view-holder.md)(holder: [AboutViewHolder](../-about-view-holder/index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Método que se llama para enlazar los datos de un objeto About con su correspondiente ViewHolder |
| [onCreateViewHolder](on-create-view-holder.md) | [androidJvm]<br>open override fun [onCreateViewHolder](on-create-view-holder.md)(parent: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), viewType: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [AboutViewHolder](../-about-view-holder/index.md)<br>Método que se llama cuando se necesita crear un nuevo ViewHolder |
