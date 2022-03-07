// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.CopyOnExpiryOptionResponse;
import io.pulumi.azurenative.dataprotection.outputs.CustomCopyOptionResponse;
import io.pulumi.azurenative.dataprotection.outputs.DataStoreInfoBaseResponse;
import io.pulumi.azurenative.dataprotection.outputs.ImmediateCopyOptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;

@OutputCustomType
public final class TargetCopySettingResponse {
    /**
     * It can be CustomCopyOption or ImmediateCopyOption.
     * 
     */
    private final Object copyAfter;
    /**
     * Info of target datastore
     * 
     */
    private final DataStoreInfoBaseResponse dataStore;

    @OutputCustomType.Constructor({"copyAfter","dataStore"})
    private TargetCopySettingResponse(
        Object copyAfter,
        DataStoreInfoBaseResponse dataStore) {
        this.copyAfter = Objects.requireNonNull(copyAfter);
        this.dataStore = Objects.requireNonNull(dataStore);
    }

    /**
     * It can be CustomCopyOption or ImmediateCopyOption.
     * 
    */
    public Object getCopyAfter() {
        return this.copyAfter;
    }
    /**
     * Info of target datastore
     * 
    */
    public DataStoreInfoBaseResponse getDataStore() {
        return this.dataStore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetCopySettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object copyAfter;
        private DataStoreInfoBaseResponse dataStore;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetCopySettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyAfter = defaults.copyAfter;
    	      this.dataStore = defaults.dataStore;
        }

        public Builder setCopyAfter(Object copyAfter) {
            this.copyAfter = Objects.requireNonNull(copyAfter);
            return this;
        }

        public Builder setDataStore(DataStoreInfoBaseResponse dataStore) {
            this.dataStore = Objects.requireNonNull(dataStore);
            return this;
        }
        public TargetCopySettingResponse build() {
            return new TargetCopySettingResponse(copyAfter, dataStore);
        }
    }
}