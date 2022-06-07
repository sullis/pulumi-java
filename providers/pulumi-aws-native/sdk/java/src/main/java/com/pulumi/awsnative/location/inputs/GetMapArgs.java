// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.location.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMapArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMapArgs Empty = new GetMapArgs();

    @Import(name="mapName", required=true)
    private Output<String> mapName;

    public Output<String> mapName() {
        return this.mapName;
    }

    private GetMapArgs() {}

    private GetMapArgs(GetMapArgs $) {
        this.mapName = $.mapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMapArgs $;

        public Builder() {
            $ = new GetMapArgs();
        }

        public Builder(GetMapArgs defaults) {
            $ = new GetMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder mapName(Output<String> mapName) {
            $.mapName = mapName;
            return this;
        }

        public Builder mapName(String mapName) {
            return mapName(Output.of(mapName));
        }

        public GetMapArgs build() {
            $.mapName = Objects.requireNonNull($.mapName, "expected parameter 'mapName' to be non-null");
            return $;
        }
    }

}
