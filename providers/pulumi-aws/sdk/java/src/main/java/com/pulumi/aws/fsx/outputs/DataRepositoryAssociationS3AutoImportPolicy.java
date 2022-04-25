// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataRepositoryAssociationS3AutoImportPolicy {
    /**
     * @return A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     * 
     */
    private final @Nullable List<String> events;

    @CustomType.Constructor
    private DataRepositoryAssociationS3AutoImportPolicy(@CustomType.Parameter("events") @Nullable List<String> events) {
        this.events = events;
    }

    /**
     * @return A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     * 
     */
    public List<String> events() {
        return this.events == null ? List.of() : this.events;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationS3AutoImportPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationS3AutoImportPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
        }

        public Builder events(@Nullable List<String> events) {
            this.events = events;
            return this;
        }
        public Builder events(String... events) {
            return events(List.of(events));
        }        public DataRepositoryAssociationS3AutoImportPolicy build() {
            return new DataRepositoryAssociationS3AutoImportPolicy(events);
        }
    }
}
