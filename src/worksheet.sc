object worksheet {
 val lista = List(1,2,3,4)                        //> lista  : List[Int] = List(1, 2, 3, 4)
 val set = Set(1,1,1,1,2,3)                       //> set  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
 val mapa = Map(1->"Jorge",2->"Bojaca")           //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Jorge, 2 -> Bo
                                                  //| jaca)
 lista.map{ x => x+3}                             //> res0: List[Int] = List(4, 5, 6, 7)
 lista.map{_+3}                                   //> res1: List[Int] = List(4, 5, 6, 7)
 lista.filter{_<=2}                               //> res2: List[Int] = List(1, 2)
// Kata 1 ---> Encontrar los pares
val numero = List.range(1,20)                     //> numero  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                                                  //| , 16, 17, 18, 19)
numero.filter(_%2==0)                             //> res3: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)

//Kata 2 ---> Encontrar los datos de una persona
val megaLista = List(List("Andres","24 years","male"),List("Ana","22 years","female"))
                                                  //> megaLista  : List[List[String]] = List(List(Andres, 24 years, male), List(An
                                                  //| a, 22 years, female))
var listaResultado = megaLista.filter(_(0)=="Andres")
                                                  //> listaResultado  : List[List[String]] = List(List(Andres, 24 years, male))
//Kata 3 ---> Encontrar los numeros primos de una lista(Siempre debe empezar en 1)
	val evaluateNumbers = List.range(1,20)    //> evaluateNumbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1
                                                  //| 3, 14, 15, 16, 17, 18, 19)
	evaluateNumbers.filter{x => evaluateNumbers.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length==1}
                                                  //> res4: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)

}