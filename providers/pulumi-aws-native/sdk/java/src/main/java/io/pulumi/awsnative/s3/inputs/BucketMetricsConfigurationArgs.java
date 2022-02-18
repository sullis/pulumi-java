// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketTagFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketMetricsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketMetricsConfigurationArgs Empty = new BucketMetricsConfigurationArgs();

    @InputImport(name="accessPointArn")
    private final @Nullable Input<String> accessPointArn;

    public Input<String> getAccessPointArn() {
        return this.accessPointArn == null ? Input.empty() : this.accessPointArn;
    }

    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    @InputImport(name="tagFilters")
    private final @Nullable Input<List<BucketTagFilterArgs>> tagFilters;

    public Input<List<BucketTagFilterArgs>> getTagFilters() {
        return this.tagFilters == null ? Input.empty() : this.tagFilters;
    }

    public BucketMetricsConfigurationArgs(
        @Nullable Input<String> accessPointArn,
        Input<String> id,
        @Nullable Input<String> prefix,
        @Nullable Input<List<BucketTagFilterArgs>> tagFilters) {
        this.accessPointArn = accessPointArn;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.prefix = prefix;
        this.tagFilters = tagFilters;
    }

    private BucketMetricsConfigurationArgs() {
        this.accessPointArn = Input.empty();
        this.id = Input.empty();
        this.prefix = Input.empty();
        this.tagFilters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPointArn;
        private Input<String> id;
        private @Nullable Input<String> prefix;
        private @Nullable Input<List<BucketTagFilterArgs>> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointArn = defaults.accessPointArn;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder setAccessPointArn(@Nullable Input<String> accessPointArn) {
            this.accessPointArn = accessPointArn;
            return this;
        }

        public Builder setAccessPointArn(@Nullable String accessPointArn) {
            this.accessPointArn = Input.ofNullable(accessPointArn);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setTagFilters(@Nullable Input<List<BucketTagFilterArgs>> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        public Builder setTagFilters(@Nullable List<BucketTagFilterArgs> tagFilters) {
            this.tagFilters = Input.ofNullable(tagFilters);
            return this;
        }

        public BucketMetricsConfigurationArgs build() {
            return new BucketMetricsConfigurationArgs(accessPointArn, id, prefix, tagFilters);
        }
    }
}
