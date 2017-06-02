package dailysuvichar.eventsapp.view.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import dailysuvichar.eventsapp.R;
import it.gmariotti.cardslib.library.cards.material.MaterialLargeImageCard;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardViewNative;

/**
 * Created by rishabhshukla on 02/06/17.
 */

public class EventsVH extends RecyclerView.ViewHolder {

    @BindView(R.id.card)
    CardViewNative cardView;

    public EventsVH(View itemView) {
        super(itemView);

        ButterKnife.bind(itemView);

    }
    
    public void setCard(final Context context){
//        ArrayList<BaseSupplementalAction> actions = new ArrayList<BaseSupplementalAction>();

        // Set supplemental actions
//        TextSupplementalAction t1 = new TextSupplementalAction(context, R.id.text1);
//        t1.setOnActionClickListener(new BaseSupplementalAction.OnActionClickListener() {
//            @Override
//            public void onClick(Card card, View view) {
//                Toast.makeText(context," Click on Text SHARE ",Toast.LENGTH_SHORT).show();
//            }
//        });
//        actions.add(t1);
//
//        TextSupplementalAction t2 = new TextSupplementalAction(context, R.id.text2);
//        t2.setOnActionClickListener(new BaseSupplementalAction.OnActionClickListener() {
//            @Override
//            public void onClick(Card card, View view) {
//                Toast.makeText(context," Click on Text LEARN ",Toast.LENGTH_SHORT).show();
//            }
//        });
//        actions.add(t2);

        //Create a Card, set the title over the image and set the thumbnail
        MaterialLargeImageCard card =
                MaterialLargeImageCard.with(context)
                        .setTextOverImage("Glimpse of the Sea")
                        .setTitle("This is my favorite local beach")
                        .setSubTitle("A wonderful place")
                        .useDrawableId(R.drawable.sea)
                        .build();

        card.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(context," Click on ActionArea ",Toast.LENGTH_SHORT).show();
            }
        });

        cardView.setCard(card);
    }
}
