Design Pattern : Proxy
1. Pourquoi le patron de conception Proxy existe
   Le patron de conception Proxy existe pour contrôler l’accès à un objet. Il est utilisé lorsqu’un objet est coûteux à instancier, sensible ou nécessite un contrôle d’accès, de la journalisation, ou une logique additionnelle. Le Proxy agit comme un intermédiaire entre le client et l’objet réel, en offrant la même interface tout en ajoutant des responsabilités supplémentaires.
2. Exemple d’utilisation dans une librairie Java
   Java propose l’API java.lang.reflect.Proxy pour créer dynamiquement des objets proxy à l’exécution. Ce mécanisme est largement utilisé dans des frameworks comme Spring. Par exemple, dans Spring, un proxy peut gérer les transactions, la sécurité ou la journalisation sans modifier les classes métier :

@Service
@Transactional
public class OrderService {
public void placeOrder() {
// logique métier
}
}
3. Description du patron de conception Proxy
   Le patron Proxy définit une interface commune pour un objet réel et un objet substitut. Le proxy intercepte les appels du client pour les rediriger vers l’objet réel tout en ajoutant une logique : contrôle d’accès, chargement différé (lazy), log, sécurité...

Structure typique :
- Subject : Interface commune
- RealSubject : Objet réel
- Proxy : Détient une référence à RealSubject, applique des règles, et implémente Subject
- Client : Utilise l’objet via l’interface sans connaître la nature réelle (proxy ou non)

Types de Proxy :
- Virtual Proxy (chargement paresseux)
- Protection Proxy (vérification des droits)
- Remote Proxy (objet distant)
- Smart Proxy (actions automatiques)


