using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;
using System.Collections;
using System.Collections.Generic;

public class GameManager : MonoBehaviour {

	public Sprite[] cardFace;
	public Sprite[] cardBack;
	public GameObject[] cards;
	public Text matchText;

	private bool _init = false;
	private int _matches = 13;


	// Update is called once per frame
	void Update () {
		if (!_init)
			initializeCards ();
		if (Input.GetMouseButtonUp (0))
			checkCards();
		
	}

	void initializeCards(){
		for (int id = 0; id < 2; id++) {
			for (int i = 1; i < 14; i++) {

				bool test = false;
				int choice = 0; 
				while (!test) {
					choice = Random.Range (0, cards.Length);
					test = !(cards [choice].GetComponent<CardScript> ().initialized);
				}
				cards [choice].GetComponent<CardScript> ().cardValue = 1;
				cards [choice].GetComponent<CardScript> ().initialized = true;
			}
		}
		foreach(GameObject c in cards)
			c.GetComponent<CardScript> ().setUpGraphics ();

			if (!_init)
				_init = true;
	}
		
	public Sprite getCardBack(){
			return cardBack;
		}
	public Sprite getCardFace(int i){
		return cardFace [i - 1];
	}

	void checkCards(){
		List<int> list = new List<int> ();
		for (int i = 0; i < cards.Length; i++) {
			if(cards[i].GetComponent<CardScript>().state == 1)
				list.Add [i];
		}
			if (list.Count == 2)
				cardComparision (list);
	}

	void cardComparision(List<int> list){
		CardScript.DO_NOT = true;

		int x = 0;

		if(cards[list[0]].GetComponent<CardScript> ().cardValue == cards[list[1]].GetComponent<CardScript>().cardValue){
			x = 2;
			_matches--;
			matchText = "Number of Matches: " + _matches;
			if (_matches == 0)
				SceneManager.LoadScene ("Menu");
		}
			for (int i = 0; i < list.Count; i++) {
				cards [list [i]].GetComponent<CardScript> ().state = x;
				cards [list [i]].GetComponent<CardScript> ().falseCheck();
			}
		}

			
}
