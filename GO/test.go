package main

/*
func main() {
	var number float64 = 2.5
	fmt.Println(number)
	age := 16
	fmt.Println(age)
	var name string
	fmt.Println("Atyn kim?")
	fmt.Scan(&name)
	fmt.Println(name + " CHORT" + " ! ")
	fmt.Println("Skolko tebe let?")
	fmt.Scan(&age)
	fmt.Println("U re " + fmt.Sprint(age) + " fucking years!WORKOUT!")

}
*/

//свитчи
/*
func main() {
	name := "Alba"

	switch name {
	case "Albert":
		fmt.Println("Wassup Albert")
	case "Killua":
		fmt.Println("Short Killua")
	case "Alba":
		fmt.Println("productive Alba")

	default:
		fmt.Println("WHO ARE YOU???")
	}
}
*/

//матан
/*
func main() {
	var a float64
	var b float64
	var c float64

	//вар переменная
	fmt.Println("Реши квадратное уравнение")
	fmt.Println("Введи a:")
	fmt.Scan(&a)

	fmt.Println("Введи b:")
	fmt.Scan(&b)

	fmt.Println("Введи c:")
	fmt.Scan(&c)

	D := (b * b) - 4*(a*c)

	if D > 0 {
		var x1 float64
		var x2 float64
		//float for 1.6 and so on.
		x1 = (-b + math.Sqrt(D)) / (2 * a)
		x2 = (-b - math.Sqrt(D)) / (2 * a)

		fmt.Println("Ваше уравнение имеет 2 корня\nD = " + fmt.Sprint(D))
		fmt.Println("X1: " + fmt.Sprint(x1) + "\nX2: " + fmt.Sprint(x2))
	} else if D == 0 {
		var x float64

		x = (-b) / (2 * a)

		fmt.Println("Ваше уравнение имеет 1 корень\nD = 0")
		fmt.Println("X: " + fmt.Sprint(x))
	} else if D < 0 {
		fmt.Println("Ваше уравнение не имеет корней\nD < 0\nD = " + fmt.Sprint(D))

	}
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)

}
*/

//main
/*
func main() {
	num := -3
	if num > 0 {
		fmt.Println("San 0den ulken")
	} else if num < 0 {
		fmt.Println("San 0den kishi")
	} else if num == 3 {
		fmt.Println("San 3ke ten")
	}
}
/*
//arrays
func main() {
	names := [3]string{"Killua", "Gon", "Hisoka"}
	fmt.Println(names, len(names))

	for i := 0; i < len(names); i++ {
		fmt.Println(names[i])
	}
}
*/
//оценки
/*
func main() {
	marks := [5]float64{11, 9, 12, 8, 10}
	var sum float64 = 0

	for i := 0; i < len(marks); i++ {
		sum += marks[i]
	}

	fmt.Println(sum)
	var result float64 = sum / float64(len(marks))
	fmt.Println(result)
}
*/
//arr
/*
import "fmt"

func main() {

	var a [5]int
	fmt.Println("emp:", a)

	a[4] = 100
	fmt.Println("set:", a)
	fmt.Println("get:", a[4])

	fmt.Println("len:", len(a))

	b := [5]int{1, 2, 3, 4, 5}
	fmt.Println("dcl:", b)

	var twoD [2][3]int
	for i := 0; i < 2; i++ {
		for j := 0; j < 3; j++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println("2d: ", twoD)
}
*/
