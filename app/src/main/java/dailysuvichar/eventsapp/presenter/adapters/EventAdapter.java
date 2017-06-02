package dailysuvichar.eventsapp.presenter.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import dailysuvichar.eventsapp.R;
import dailysuvichar.eventsapp.model.Event;
import dailysuvichar.eventsapp.view.viewholders.EventsVH;

/**
 * Created by rishabhshukla on 02/06/17.
 */

public class EventAdapter extends RecyclerView.Adapter<EventsVH> {

    ArrayList<Event> events;
    Context context, pContext;
    private int mPosition;

    public EventAdapter(ArrayList<Event> events, Context context){
        this.context = context;
        this.events = events;
    }

    @Override
    public EventsVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_event, parent, false);
        pContext = parent.getContext();
        return new EventsVH(view);
    }

    @Override
    public void onBindViewHolder(EventsVH holder, int position) {
        holder.setCard(context);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
