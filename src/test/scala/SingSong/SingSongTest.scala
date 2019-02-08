package SingSong

import org.scalatest.FunSuite

class SingSongTest extends FunSuite {
  val first_animals: List[Animal] = List(
    Animal(name="fly", moto=None),
    Animal(name="spider", moto=Some("That wriggled and wiggled and tickled inside her.")),
    Animal(name="bird", moto=Some("How absurd to swallow a bird.")),
    Animal(name="cat", moto=Some("Fancy that to swallow a cat!")),
    Animal(name="dog", moto=Some("What a hog, to swallow a dog!")),
    Animal(name="cow", moto=Some("I don't know how she swallowed a cow!")),
    Animal(name="horse", moto=None)
  )

  val second_animals: List[Animal] = List(
    Animal(name="dog", moto=None),
    Animal(name="sheep", moto=Some("Hi ! I'm the official sheep")),
    Animal(name="demogorgon", moto=Some("Love stranger things")),
    Animal(name="lezard", moto=Some("Hi ! I'm the official lezard")),
    Animal(name="worm", moto=Some("Worms take my money")),
    Animal(name="crocodile", moto=Some("Crocodile Dundee")),
    Animal(name="lockness", moto=None)
  )

  test("it returns the valid song for the first set") {
    assert(SingSong.singsong(first_animals) == """
        |There was an old lady who swallowed a fly.
        |I don't know why she swallowed a fly - perhaps she'll die!
        |
        |There was an old lady who swallowed a spider;
        |That wriggled and wiggled and tickled inside her.
        |She swallowed the spider to catch the fly;
        |I don't know why she swallowed a fly - perhaps she'll die!
        |
        |There was an old lady who swallowed a bird;
        |How absurd to swallow a bird.
        |She swallowed the bird to catch the spider,
        |She swallowed the spider to catch the fly;
        |I don't know why she swallowed a fly - perhaps she'll die!
        |
        |There was an old lady who swallowed a cat;
        |Fancy that to swallow a cat!
        |She swallowed the cat to catch the bird,
        |She swallowed the bird to catch the spider,
        |She swallowed the spider to catch the fly;
        |I don't know why she swallowed a fly - perhaps she'll die!
        |
        |There was an old lady who swallowed a dog;
        |What a hog, to swallow a dog!
        |She swallowed the dog to catch the cat,
        |She swallowed the cat to catch the bird,
        |She swallowed the bird to catch the spider,
        |She swallowed the spider to catch the fly;
        |I don't know why she swallowed a fly - perhaps she'll die!
        |
        |There was an old lady who swallowed a cow;
        |I don't know how she swallowed a cow!
        |She swallowed the cow to catch the dog,
        |She swallowed the dog to catch the cat,
        |She swallowed the cat to catch the bird,
        |She swallowed the bird to catch the spider,
        |She swallowed the spider to catch the fly;
        |I don't know why she swallowed a fly - perhaps she'll die!
        |
        |There was an old lady who swallowed a horse...
        |...She's dead, of course!`""".stripMargin
    )
  }

  test("it returns the valid song for the second set") {
    assert(SingSong.singsong(second_animals) == """
       |There was an old lady who swallowed a dog.
       |I don't know why she swallowed a dog - perhaps she'll die!
       |
       |There was an old lady who swallowed a sheep;
       |Hi ! I'm the official sheep
       |She swallowed the sheep to catch the dog;
       |I don't know why she swallowed a dog - perhaps she'll die!
       |
       |There was an old lady who swallowed a demogorgon;
       |Love stranger things
       |She swallowed the demogorgon to catch the sheep,
       |She swallowed the sheep to catch the dog;
       |I don't know why she swallowed a dog - perhaps she'll die!
       |
       |There was an old lady who swallowed a lezard;
       |Hi ! I'm the official lezard
       |She swallowed the lezard to catch the demogorgon,
       |She swallowed the demogorgon to catch the sheep,
       |She swallowed the sheep to catch the dog;
       |I don't know why she swallowed a dog - perhaps she'll die!
       |
       |There was an old lady who swallowed a worm;
       |Worms take my money
       |She swallowed the worm to catch the lezard,
       |She swallowed the lezard to catch the demogorgon,
       |She swallowed the demogorgon to catch the sheep,
       |She swallowed the sheep to catch the dog;
       |I don't know why she swallowed a dog - perhaps she'll die!
       |
       |There was an old lady who swallowed a crocodile;
       |Crocodile Dundee
       |She swallowed the crocodile to catch the worm,
       |She swallowed the worm to catch the lezard,
       |She swallowed the lezard to catch the demogorgon,
       |She swallowed the demogorgon to catch the sheep,
       |She swallowed the sheep to catch the dog;
       |I don't know why she swallowed a dog - perhaps she'll die!
       |
       |There was an old lady who swallowed a lockness...
       |...She's dead, of course!`""".stripMargin
    )
  }
}
