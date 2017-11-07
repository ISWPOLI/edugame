using System.Collections;
using System.Collections.Generic;
using UnityEngine.SceneManagement;
using UnityEngine;

public class Quiz : MonoBehaviour {




	public void checkQuiz(int value){
		switch(value){
		default:
		case(1):
			SceneManager.LoadScene ("GameOver");
			PlayerPrefs.SetInt ("Score", PlayerPrefs.GetInt ("Score") + 550);
			break;
		case(2):
			SceneManager.LoadScene("GameOver");
			PlayerPrefs.SetInt ("Score", PlayerPrefs.GetInt ("Score") + 10);
			break;
		case(3):
			SceneManager.LoadScene("GameOver");
			PlayerPrefs.SetInt ("Score", PlayerPrefs.GetInt ("Score") + 10);
			break;

		}
	}
}
