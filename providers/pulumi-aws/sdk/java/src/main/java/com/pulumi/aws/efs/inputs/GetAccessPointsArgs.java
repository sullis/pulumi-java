// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPointsArgs Empty = new GetAccessPointsArgs();

    /**
     * EFS File System identifier.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return EFS File System identifier.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    private GetAccessPointsArgs() {}

    private GetAccessPointsArgs(GetAccessPointsArgs $) {
        this.fileSystemId = $.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPointsArgs $;

        public Builder() {
            $ = new GetAccessPointsArgs();
        }

        public Builder(GetAccessPointsArgs defaults) {
            $ = new GetAccessPointsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemId EFS File System identifier.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId EFS File System identifier.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        public GetAccessPointsArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}
