// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataflowEndpointGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataflowEndpointGroupPlainArgs Empty = new GetDataflowEndpointGroupPlainArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetDataflowEndpointGroupPlainArgs() {}

    private GetDataflowEndpointGroupPlainArgs(GetDataflowEndpointGroupPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataflowEndpointGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataflowEndpointGroupPlainArgs $;

        public Builder() {
            $ = new GetDataflowEndpointGroupPlainArgs();
        }

        public Builder(GetDataflowEndpointGroupPlainArgs defaults) {
            $ = new GetDataflowEndpointGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetDataflowEndpointGroupPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
