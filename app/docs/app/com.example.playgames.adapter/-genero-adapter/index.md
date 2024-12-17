//[app](../../../index.md)/[com.example.playgames.adapter](../index.md)/[GeneroAdapter](index.md)

# GeneroAdapter

[androidJvm]\
class [GeneroAdapter](index.md)(generoList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Genero](../../com.example.playgames.model/-genero/index.md)&gt;) : [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html)&lt;[GeneroViewHolder](../-genero-view-holder/index.md)&gt; 

Clase GeneroAdapter que extiende de RecyclerView.Adapter y recibe una lista de objetos Genero como parámetro

## Constructors

| | |
|---|---|
| [GeneroAdapter](-genero-adapter.md) | [androidJvm]<br>constructor(generoList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Genero](../../com.example.playgames.model/-genero/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [getItemCount](get-item-count.md) | [androidJvm]<br>open override fun [getItemCount](get-item-count.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Método que devuelve el número de elementos en la lista |
| [onBindViewHolder](on-bind-view-holder.md) | [androidJvm]<br>open override fun [onBindViewHolder](on-bind-view-holder.md)(holder: [GeneroViewHolder](../-genero-view-holder/index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Método que se llama para enlazar los datos de un objeto Genero con su correspondiente ViewHolder |
| [onCreateViewHolder](on-create-view-holder.md) | [androidJvm]<br>open override fun [onCreateViewHolder](on-create-view-holder.md)(parent: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), viewType: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [GeneroViewHolder](../-genero-view-holder/index.md)<br>Método que se llama cuando se necesita crear un nuevo ViewHolder |
