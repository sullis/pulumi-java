// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPlainArgs Empty = new GetServerPlainArgs();

    /**
     * ID for an SFTP server.
     * 
     */
    @Import(name="serverId", required=true)
    private String serverId;

    /**
     * @return ID for an SFTP server.
     * 
     */
    public String serverId() {
        return this.serverId;
    }

    private GetServerPlainArgs() {}

    private GetServerPlainArgs(GetServerPlainArgs $) {
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerPlainArgs $;

        public Builder() {
            $ = new GetServerPlainArgs();
        }

        public Builder(GetServerPlainArgs defaults) {
            $ = new GetServerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverId ID for an SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            $.serverId = serverId;
            return this;
        }

        public GetServerPlainArgs build() {
            $.serverId = Objects.requireNonNull($.serverId, "expected parameter 'serverId' to be non-null");
            return $;
        }
    }

}
