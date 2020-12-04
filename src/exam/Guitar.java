package exam;

class Game{ } 
class Cricket extends Game{ } 
class Instrument{ 
	{
		POINTLESS_LABEL:;
	}
} 
class Guitar extends Instrument{ }  
interface Player<E>{ void play(E e); } 
interface GamePlayer<E extends Game> extends Player<E>{ } 
interface MusicPlayer<E extends Instrument> extends Player{ }

class MidiPlayer implements MusicPlayer<Instrument> {
	public void play(Object o){ } // doesn't compile if the arg is Guitar or Instrument
}