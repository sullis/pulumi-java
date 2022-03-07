// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataLakeAnalyticsResponseProperties {
    /**
     * DataLake Store Account Name
     * 
     */
    private final @Nullable String dataLakeStoreAccountName;

    @OutputCustomType.Constructor({"dataLakeStoreAccountName"})
    private DataLakeAnalyticsResponseProperties(@Nullable String dataLakeStoreAccountName) {
        this.dataLakeStoreAccountName = dataLakeStoreAccountName;
    }

    /**
     * DataLake Store Account Name
     * 
    */
    public Optional<String> getDataLakeStoreAccountName() {
        return Optional.ofNullable(this.dataLakeStoreAccountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeAnalyticsResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataLakeStoreAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeAnalyticsResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLakeStoreAccountName = defaults.dataLakeStoreAccountName;
        }

        public Builder setDataLakeStoreAccountName(@Nullable String dataLakeStoreAccountName) {
            this.dataLakeStoreAccountName = dataLakeStoreAccountName;
            return this;
        }
        public DataLakeAnalyticsResponseProperties build() {
            return new DataLakeAnalyticsResponseProperties(dataLakeStoreAccountName);
        }
    }
}