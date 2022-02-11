// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMapArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMapArgs Empty = new GetMapArgs();

    @InputImport(name="mapName", required=true)
    private final String mapName;

    public String getMapName() {
        return this.mapName;
    }

    public GetMapArgs(String mapName) {
        this.mapName = Objects.requireNonNull(mapName, "expected parameter 'mapName' to be non-null");
    }

    private GetMapArgs() {
        this.mapName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mapName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapName = defaults.mapName;
        }

        public Builder setMapName(String mapName) {
            this.mapName = Objects.requireNonNull(mapName);
            return this;
        }

        public GetMapArgs build() {
            return new GetMapArgs(mapName);
        }
    }
}
