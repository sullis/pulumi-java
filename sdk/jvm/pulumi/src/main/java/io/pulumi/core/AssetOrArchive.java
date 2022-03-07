package io.pulumi.core;

import io.pulumi.core.internal.Internal.Field;
import io.pulumi.core.internal.annotations.InternalUse;

import java.util.Objects;

/**
 * Base class of @see {@link Asset}s and @see {@link Archive}s.
 */
public abstract class AssetOrArchive {

    protected final String sigKey;
    protected final String propName;
    protected final Object value;

    @Field
    protected final Internal internal = new Internal();

    protected AssetOrArchive(String sigKey, String propName, Object value) {
        this.sigKey = Objects.requireNonNull(sigKey);
        this.propName = Objects.requireNonNull(propName);
        this.value = Objects.requireNonNull(value);
    }

    public final class Internal {

        private Internal() {
            /* Empty */
        }

        @InternalUse
        public String getSigKey() {
            return AssetOrArchive.this.sigKey;
        }

        @InternalUse
        public Object getValue() {
            return AssetOrArchive.this.value;
        }

        @InternalUse
        public String getPropName() {
            return AssetOrArchive.this.propName;
        }
    }
}