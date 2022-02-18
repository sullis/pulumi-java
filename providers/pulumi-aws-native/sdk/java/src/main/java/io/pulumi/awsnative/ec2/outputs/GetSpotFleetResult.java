// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.SpotFleetRequestConfigData;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSpotFleetResult {
    private final @Nullable String id;
    private final @Nullable SpotFleetRequestConfigData spotFleetRequestConfigData;

    @OutputCustomType.Constructor({"id","spotFleetRequestConfigData"})
    private GetSpotFleetResult(
        @Nullable String id,
        @Nullable SpotFleetRequestConfigData spotFleetRequestConfigData) {
        this.id = id;
        this.spotFleetRequestConfigData = spotFleetRequestConfigData;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<SpotFleetRequestConfigData> getSpotFleetRequestConfigData() {
        return Optional.ofNullable(this.spotFleetRequestConfigData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpotFleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable SpotFleetRequestConfigData spotFleetRequestConfigData;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpotFleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.spotFleetRequestConfigData = defaults.spotFleetRequestConfigData;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setSpotFleetRequestConfigData(@Nullable SpotFleetRequestConfigData spotFleetRequestConfigData) {
            this.spotFleetRequestConfigData = spotFleetRequestConfigData;
            return this;
        }

        public GetSpotFleetResult build() {
            return new GetSpotFleetResult(id, spotFleetRequestConfigData);
        }
    }
}
