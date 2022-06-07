// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerArgs Empty = new GetServerArgs();

    /**
     * ID for an SFTP server.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<String> serverId;

    /**
     * @return ID for an SFTP server.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    private GetServerArgs() {}

    private GetServerArgs(GetServerArgs $) {
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerArgs $;

        public Builder() {
            $ = new GetServerArgs();
        }

        public Builder(GetServerArgs defaults) {
            $ = new GetServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverId ID for an SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId ID for an SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        public GetServerArgs build() {
            $.serverId = Objects.requireNonNull($.serverId, "expected parameter 'serverId' to be non-null");
            return $;
        }
    }

}
