package com.example.tahlil;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

  public class AdapterTahlil extends RecyclerView.Adapter<AdapterTahlil.TahlilHolder> {
      List<Tahlil> Tahlilnya;
      Activity activity;



      public AdapterTahlil(List<Tahlil> tahlilnya, Activity activity) {
          this.Tahlilnya = tahlilnya;
          this.activity = activity;
      }

      @NonNull
      @Override
      public TahlilHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view = LayoutInflater.from(activity).inflate(R.layout.rv_item, parent, false);
          return new TahlilHolder(view);
      }

      @Override
      public void onBindViewHolder(@NonNull TahlilHolder holder, final int position) {
          holder.txttitle.setText(Tahlilnya.get(position).getTitle());
          holder.txtarabic.setText(Tahlilnya.get(position).getArabic());
          holder.txttranslation.setText(Tahlilnya.get(position).getTranslation());
          holder.itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent kirim = new Intent(activity, AdapterTahlil.class);
                  kirim.putExtra("baca", Tahlilnya.get(position));
                  view.getContext().startActivity(kirim);
              }
          });
      }


          @Override
          public int getItemCount () {
              return Tahlilnya.size();
          }

          static class TahlilHolder extends RecyclerView.ViewHolder {
              TextView    txttitle, txtarabic, txttranslation;


              public TahlilHolder(@NonNull View itemView) {
                  super(itemView);

                  txttitle = (TextView) itemView.findViewById(R.id.txt_title);
                  txtarabic = (TextView) itemView.findViewById(R.id.txtarabic);
                  txttranslation = (TextView) itemView.findViewById(R.id.txttranslation);





              }
          }

      }
