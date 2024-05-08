package com.jubaw.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

/*
     ************ KOTLIN DATA CLASS NEDIR *****************************
     * Otomatik Oluşturulan Fonksiyonlar:

    equals(): Nesnelerin eşitliğini kontrol eder.
    hashCode(): Nesnenin hash kodunu döndürür.
    toString(): Nesnenin string temsilini döndürür.
    copy(): Nesnenin bir kopyasını oluşturur.
    getter-setter metodları
 */

@Entity
@Table(name = "t_user")
 class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     val id: Long, //@Getter


    @Column(nullable = false)
     var name: String, //Getter - Setter

    @Column(nullable = false)
     var email: String,  //Getter - Setter

 ) {

     //Constructor needed for JPA
     protected constructor() : this(0,"","")

}