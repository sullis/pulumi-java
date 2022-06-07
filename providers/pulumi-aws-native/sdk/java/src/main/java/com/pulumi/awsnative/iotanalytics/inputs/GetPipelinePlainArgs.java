// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelinePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelinePlainArgs Empty = new GetPipelinePlainArgs();

    @Import(name="pipelineName", required=true)
    private String pipelineName;

    public String pipelineName() {
        return this.pipelineName;
    }

    private GetPipelinePlainArgs() {}

    private GetPipelinePlainArgs(GetPipelinePlainArgs $) {
        this.pipelineName = $.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelinePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelinePlainArgs $;

        public Builder() {
            $ = new GetPipelinePlainArgs();
        }

        public Builder(GetPipelinePlainArgs defaults) {
            $ = new GetPipelinePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder pipelineName(String pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        public GetPipelinePlainArgs build() {
            $.pipelineName = Objects.requireNonNull($.pipelineName, "expected parameter 'pipelineName' to be non-null");
            return $;
        }
    }

}
