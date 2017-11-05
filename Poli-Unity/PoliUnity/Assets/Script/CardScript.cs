using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class CardScript : MonoBehaviour {

	public static bool DO_NOT = false;
	[SerializeField]
	private int _state;
	[SerializeField]
	private int _cardValue;
	[SerializeField]
	private bool _initialized = false;

	private Sprite _cardBack;
	private Sprite _cardFace;

	private GameObject _manager;

	void start(){
		_state = 0;
		_manager = GameObject.FindGameObjectsWithTag ("Manager");


	}

	public void setUpGraphics(){
		_cardBack = _manager.GetComponent<GameManager> ().getCardBack ();
		_cardFace = _manager.GetComponent<GameManager> ().getCardBack (_cardValue);

		flipCard ();
	}

	void flipCard(){
		if (_state == 0 && !DO_NOT)
			GetComponent<Image> ().sprite = _cardBack;
		else if (_state == 1 && !DO_NOT)
			GetComponent<Image> ().sprite = _cardFace;
	}

	public int cardValue {
		get { return _cardValue; }
		set { _cardValue = value; }
	}

	public int state {
		get { return _state; }
		set { _state = value; }
	}

	public bool initialized{
		get { return _initialized; }
		set { _initialized = value; }
	}
}
