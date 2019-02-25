package com.ehi.component.cache;

import android.support.annotation.NonNull;
import com.ehi.component.ComponentConfig;

/**
 * <pre>
 * @author : zbb 33775
 * @Date: 2019/2/25 13:50
 * </pre>
 */
public class DefaultCacheFactory implements Cache.Factory{

    public static DefaultCacheFactory INSTANCE = new DefaultCacheFactory();

    @NonNull
    @Override
    public Cache build(CacheType type) {
        return new LruCache(type.calculateCacheSize(ComponentConfig.getApplication()));
    }
}
