// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opsworkscm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPlainArgs Empty = new GetServerPlainArgs();

    @Import(name="serverName", required=true)
    private String serverName;

    public String serverName() {
        return this.serverName;
    }

    private GetServerPlainArgs() {}

    private GetServerPlainArgs(GetServerPlainArgs $) {
        this.serverName = $.serverName;
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

        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetServerPlainArgs build() {
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
