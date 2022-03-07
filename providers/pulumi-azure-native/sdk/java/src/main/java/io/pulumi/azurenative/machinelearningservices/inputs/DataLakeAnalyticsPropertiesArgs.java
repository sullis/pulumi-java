// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataLakeAnalyticsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeAnalyticsPropertiesArgs Empty = new DataLakeAnalyticsPropertiesArgs();

    /**
     * DataLake Store Account Name
     * 
     */
    @InputImport(name="dataLakeStoreAccountName")
      private final @Nullable Input<String> dataLakeStoreAccountName;

    public Input<String> getDataLakeStoreAccountName() {
        return this.dataLakeStoreAccountName == null ? Input.empty() : this.dataLakeStoreAccountName;
    }

    public DataLakeAnalyticsPropertiesArgs(@Nullable Input<String> dataLakeStoreAccountName) {
        this.dataLakeStoreAccountName = dataLakeStoreAccountName;
    }

    private DataLakeAnalyticsPropertiesArgs() {
        this.dataLakeStoreAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeAnalyticsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataLakeStoreAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeAnalyticsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLakeStoreAccountName = defaults.dataLakeStoreAccountName;
        }

        public Builder setDataLakeStoreAccountName(@Nullable Input<String> dataLakeStoreAccountName) {
            this.dataLakeStoreAccountName = dataLakeStoreAccountName;
            return this;
        }

        public Builder setDataLakeStoreAccountName(@Nullable String dataLakeStoreAccountName) {
            this.dataLakeStoreAccountName = Input.ofNullable(dataLakeStoreAccountName);
            return this;
        }
        public DataLakeAnalyticsPropertiesArgs build() {
            return new DataLakeAnalyticsPropertiesArgs(dataLakeStoreAccountName);
        }
    }
}