(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0) (* -1 x) x)
  )

(defn divides? [divisor n]
  (==(mod n divisor) 0)
)


(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 3) 0) "fizz"
   (== (mod n 5) 0) "buzz"
   :else ""
   )
)

(defn teen? [age]
  (if(and (< age 20) (> age 12)) true false)
  )

(defn not-teen? [age]
  (if (teen? age) false true)
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true
   )
  )

(defn leap-year? [year]
  (or
   (and (divides? 4 year) (not (divides? 100 year)))
   (divides? 400 year))
  )



; '_______'
