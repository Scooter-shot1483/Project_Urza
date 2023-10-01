package com.example.projecturza;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> plusOneList;
    private ArrayList<String> minusOneList;
    private ArrayList<String> minusSixList;
    private EditText txtLoyaltyCounters;

    @SuppressLint("SetTextI18n")
    protected void onClick(View v) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ArrayLists, textView, and EditText boxes
        @SuppressLint("CutPasteId") TextView txtPlusOne = findViewById(R.id.txtPlusOne);
        txtPlusOne.setText("<-- Click the +1 button to show ability");

        @SuppressLint("CutPasteId") TextView txtMinusOne = findViewById(R.id.txtMinusOne);
        txtMinusOne.setText("<-- Click the -1 button to show ability");

        @SuppressLint("CutPasteId") TextView txtMinusSix = findViewById(R.id.txtMinusSix);
        txtMinusSix.setText("<-- Click the -6 button to show ability");

        plusOneList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                plusOneList.add("1." + i + 1 + "Until end of turn, up to one target creature gets +1/+1 and gains first strike, vigilence, and lifelink.");
                plusOneList.add("2." + i + 1 + "Distribute three +1/+1 counters among one, two, or three target creatures you control.");
                plusOneList.add("3." + i + 1 + "Destroy target noncreature permanent.");
                plusOneList.add("4." + i + 1 + "Create two 3/1 red Elemental creature tokens with haste. Exile them at the beginning of the next end step.");
                plusOneList.add("5." + i + 1 + "Create three 1/1 white Soldier creature tokens.");
                plusOneList.add("6." + i + 1 + "Create a 3/3 black Beast creature token with deathtouch.");
                plusOneList.add("7." + i + 1 + "Reveal the top five cards of your library. Put all creature cards revealed this way into your hand and the rest on the bottom of your library in any order.");
                plusOneList.add("8." + i + 1 + "During target opponent's next turn, creatures that player controls attack Urza if able.");
                plusOneList.add("9." + i + 1 + "Put a loyalty counter on Urza for each creature target opponent controls.");
                plusOneList.add("10." + i + 1 + "Until your next turn, whenever a creature an opponent controls attacks, it gets -1/-0 until end of turn.");
                plusOneList.add("11." + i + 1 + "Target player exiles a card from their hand.");
                plusOneList.add("12." + i + 1 + "Reveal the top card of your library. If it's a land card, put it onto the battlefield. Otherwise, put it into your hand.");
                plusOneList.add("13." + i + 1 + "Target land you control becomes a 4/4 Elemental creature with trample. It's still a land.");
                plusOneList.add("14." + i + 1 + "Draw a card, then add one mana of any color to your mana pool.");
                plusOneList.add("15." + i + 1 + "Until end of turn, Urza becomes a legendary 4/4 red Dragon creature with flying, indestructible, and haste. (He doesn't lose loyalty while he's not a planeswalker.)");
                plusOneList.add("16." + i + 1 + "Until your next turn, creatures you control get +1/+0 and gain lifelink.");
                plusOneList.add("17." + i + 1 + "Look at the top five cards of your library. You may reveal an artifact card from among them and put it into your hand. Put the rest on the bottom of your library in any order.");
                plusOneList.add("18." + i + 1 + "Urza deals 3 damage to target creature or player.");
                plusOneList.add("19." + i + 1 + "Until your next turn, whenever a creature deals combat damage to Urza, destroy that creature.");
                plusOneList.add("20." + i + 1 + "Add X mana in any combination of colors to your mana pool, where X is the number of creatures you control.");
            }

        minusOneList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                minusOneList.add("1." + i + 1 + "Urza deals 3 damage to each creature.");
                minusOneList.add("2." + i + 1 + "Gain control of target creature.");
                minusOneList.add("3." + i + 1 + "Urza deals 4 damage to any target and you gain 4 life.");
                minusOneList.add("4." + i + 1 + "Destroy target creature. You gain life equal to its toughness.");
                minusOneList.add("5." + i + 1 + "You get an emblem with \"Creatures you control get +1/+1.\"");
                minusOneList.add("6." + i + 1 + "You may put a creature card from your hand onto the battlefield.");
                minusOneList.add("7." + i + 1 + "Draw three cards, then put a card from your hand on top of your library.");
                minusOneList.add("8." + i + 1 + "Target player puts the top ten cards of his or her library into his or her graveyard.");
                minusOneList.add("9." + i + 1 + "Reveal the top five cards of your library. An opponent separates those cards into two piles. Put one pile into your hand and the other on the bottom of your library in any order.");
                minusOneList.add("10." + i + 1 + "Exile target permanent.");
                minusOneList.add("11." + i + 1 + "Reveal the top five cards of your library. You may put all creature cards and/or land cards from among them into your hand. Put the rest into your graveyard.");
                minusOneList.add("12." + i + 1 + "Search your library for a card and put that card into your hand. Then shuffle your library.");
                minusOneList.add("13." + i + 1 + "Target player sacrifices two creatures.");
                minusOneList.add("14." + i + 1 + "Create a 5/5 black Demon creature token with flying. You lose 2 life.");
                minusOneList.add("15." + i + 1 + "Create a 4/4 gold Dragon creature token with flying.");
                minusOneList.add("16." + i + 1 + "Target player's life total becomes 10.");
                minusOneList.add("17." + i + 1 + "Destroy target nonland permanent.");
                minusOneList.add("18." + i + 1 + "Return target permanent from a graveyard to the battlefield under your control.");
                minusOneList.add("19." + i + 1 + "Create two 3/3 green Beast creature tokens.");
                minusOneList.add("20." + i + 1 + "Draw four cards and discard two cards.");
            }

        minusSixList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                minusSixList.add("1." + i + 1 + "Urza deals 7 damage to target player or planeswalker. That player or that planeswalker's controller discards seven cards, then sacrifices seven permanents.");
                minusSixList.add("2." + i + 1 + "You get an emblem with \"If a source would deal damage to you or a planeswalker you control, prevent all but 1 of that damage.\"");
                minusSixList.add("3." + i + 1 + "Destroy all lands target player controls.");
                minusSixList.add("4." + i + 1 + "Create X 2/2");
                minusSixList.add("5." + i + 1 + "You gain 100 life.");
                minusSixList.add("6." + i + 1 + "Urza deals 10 damage to target player and each creature he or she controls.");
                minusSixList.add("7." + i + 1 + "You get an emblem with \"Creatures you control have double strike, trample, hexproof, and haste.\"");
                minusSixList.add("8." + i + 1 + "You get an emblem with \"Artifacts, creatures, enchantments, and lands you control have indestructible.\"");
                minusSixList.add("9." + i + 1 + "Create a 6/6 green Wurm creature token for each land you control.");
                minusSixList.add("10." + i + 1 + "Each player shuffles his or her hand and graveyard into his or her library. You draw seven cards.");
                minusSixList.add("11." + i + 1 + "Destroy up to three target creatures and/or other planeswalkers. Return each card put into a graveyard this way to the battlefield under your control.");
                minusSixList.add("12." + i + 1 + "You get an emblem with \"Whenever you cast a spell, exile target permanent.\"");
                minusSixList.add("13." + i + 1 + "You get an emblem with \"Whenever a creature enters the battlefield under your control, you may have it fight target creature.\" Then create three 8/8 blue Octopus creature tokens.");
                minusSixList.add("14." + i + 1 + "You control target player during that player's next turn.");
                minusSixList.add("15." + i + 1 + "Exile all cards from target player's library, then that player shuffles his or her hand into his or her library.");
                minusSixList.add("16." + i + 1 + "Create three 1/1 black Assassin creature tokens with \"Whenever this creature deals combat damage to a player, that player loses the game.\"");
                minusSixList.add("17." + i + 1 + "Put all creature cards from all graveyards onto the battlefield under your control.");
                minusSixList.add("18." + i + 1 + "You gain X life and draw X cards, where X is the number of lands you control.");
                minusSixList.add("19." + i + 1 + "Flip five coins. Take an extra turn after this one for each coin that comes up heads.");
                minusSixList.add("20." + i + 1 + "You gain 7 life, draw seven cards, then put up to seven permanent cards from your hand onto the battlefield.");
            }

        EditText txtLoyaltyCounters = findViewById(R.id.txtLoyaltyCounters);
        String defaultText = "4";
        txtLoyaltyCounters.setText("4");

        //Set OnClickListeners for Buttons
        ImageButton btnPlusOne = findViewById(R.id.btnPlusOne);

        btnPlusOne.setOnClickListener(v1 -> {
            // Choose a random item from plusOneList
            Random random = new Random();
            String randomItem = plusOneList.get(random.nextInt(plusOneList.size()));

            // Update text within ability text boxes
            @SuppressLint("CutPasteId") TextView txtPlusOne1 = findViewById(R.id.txtPlusOne);
            txtPlusOne1.setText(randomItem);

            //Update the total value in the same txtLoyaltyCounters box
            updateTotalValue();
        });

        ImageButton btnMinusOne = findViewById(R.id.btnMinusOne);
        btnMinusOne.setOnClickListener(v12 -> {
            // Choose a random item from minusOneList
            Random random = new Random();
            String randomItem = minusOneList.get(random.nextInt(minusOneList.size()));

            // Update txtLoyaltyCounters
            TextView txtMinusOne1 = findViewById(R.id.txtMinusOne);
            txtMinusOne1.setText(randomItem);

            //Update the total value in the same txtLoyaltyCounters box
            updateTotalValue();
        });

        ImageButton btnMinusSix = findViewById(R.id.btnMinusSix);
        btnMinusSix.setOnClickListener(v13 -> {
            // Choose a random item from plusOneList
            Random random = new Random();
            String randomItem = minusSixList.get(random.nextInt(minusSixList.size()));

            // Update txtLoyaltyCounters
            TextView txtMinusSix1 = findViewById(R.id.txtMinusSix);
            txtMinusSix1.setText(randomItem);

            //Update the total value in the same txtLoyaltyCounters box
            updateTotalValue();
        });

        Button btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(v14 -> {
            txtPlusOne.setText(defaultText);
            txtMinusOne.setText(defaultText);
            txtMinusSix.setText(defaultText);
            txtLoyaltyCounters.setText(defaultText);
        });
    }

// Calculations for txtLoyaltyCounters
    private void updateTotalValue() {
        // Get the values from each EditText
        String plusOneValue = ((android.widget.TextView) findViewById(R.id.txtPlusOne)).getText().toString();
        String minusOneValue = ((android.widget.TextView) findViewById(R.id.txtMinusOne)).getText().toString();
        String minusSixValue = ((android.widget.TextView) findViewById(R.id.txtMinusSix)).getText().toString();

        // Calculate the total value and update the corresponding EditText
        int totalValue = 0;
        if (!plusOneValue.isEmpty()) {
            totalValue += Integer.parseInt(plusOneValue);
        }
        if (!minusOneValue.isEmpty()) {
            totalValue -= Integer.parseInt(minusOneValue);
        }
        if (!minusSixValue.isEmpty()) {
            totalValue -= Integer.parseInt(minusSixValue);
            txtLoyaltyCounters.setText(String.valueOf(totalValue));
        } else {
            txtLoyaltyCounters.setText(String.valueOf(totalValue));
        }

    }
}
