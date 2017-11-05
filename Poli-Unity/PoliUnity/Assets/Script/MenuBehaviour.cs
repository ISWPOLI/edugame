using System.Collections;
using System.Collections.Generic;
using UnityEngine.SceneManagement;
using UnityEngine;

public class MenuBehaviour : MonoBehaviour {

	public void triggerMenuBehavior(int i){
        switch(i){
        default:
        case(1):
            SceneManager.LoadScene("PlayScene");
        break;
        case(2):
             SceneManager.LoadScene("Puntuaciones");
        break;
        case(0):
            Application.Quit ();
        break;

        }

	}
}
