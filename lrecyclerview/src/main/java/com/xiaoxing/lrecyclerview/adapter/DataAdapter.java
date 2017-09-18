package com.xiaoxing.lrecyclerview.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiaoxing.glideutil.GlideUtil;
import com.xiaoxing.lrecyclerview.R;
import com.xiaoxing.lrecyclerview.model.ItemModel;


/**
 * 描述：
 * 作者：xiaoxing on 17/5/9 00:33
 * 邮箱：2235445233@qq.com
 */

public class DataAdapter extends ListBaseAdapter<ItemModel> {

    private Context mContext;

    public DataAdapter(Context context) {
        super(context);

        this.mContext = context;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_card;
    }

    @Override
    public void onBindItemHolder(SuperViewHolder holder, int position) {
        ItemModel item = mDataList.get(position);

        TextView titleText = holder.getView(R.id.info_text);
        TextView card_price = holder.getView(R.id.card_price);
        titleText.setText(item.title);
        card_price.setText(item.content);

        ImageView imageView = holder.getView(R.id.card_img);

        int dafaultRes = 0;
        dafaultRes = R.drawable.icon_mo_ren;
        GlideUtil.displayImg(mContext, item.imgUrl, imageView, dafaultRes);
    }
}
