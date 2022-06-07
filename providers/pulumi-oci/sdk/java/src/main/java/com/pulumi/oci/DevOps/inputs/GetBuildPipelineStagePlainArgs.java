// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBuildPipelineStagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBuildPipelineStagePlainArgs Empty = new GetBuildPipelineStagePlainArgs();

    /**
     * Unique stage identifier.
     * 
     */
    @Import(name="buildPipelineStageId", required=true)
    private String buildPipelineStageId;

    /**
     * @return Unique stage identifier.
     * 
     */
    public String buildPipelineStageId() {
        return this.buildPipelineStageId;
    }

    private GetBuildPipelineStagePlainArgs() {}

    private GetBuildPipelineStagePlainArgs(GetBuildPipelineStagePlainArgs $) {
        this.buildPipelineStageId = $.buildPipelineStageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBuildPipelineStagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBuildPipelineStagePlainArgs $;

        public Builder() {
            $ = new GetBuildPipelineStagePlainArgs();
        }

        public Builder(GetBuildPipelineStagePlainArgs defaults) {
            $ = new GetBuildPipelineStagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildPipelineStageId Unique stage identifier.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineStageId(String buildPipelineStageId) {
            $.buildPipelineStageId = buildPipelineStageId;
            return this;
        }

        public GetBuildPipelineStagePlainArgs build() {
            $.buildPipelineStageId = Objects.requireNonNull($.buildPipelineStageId, "expected parameter 'buildPipelineStageId' to be non-null");
            return $;
        }
    }

}
