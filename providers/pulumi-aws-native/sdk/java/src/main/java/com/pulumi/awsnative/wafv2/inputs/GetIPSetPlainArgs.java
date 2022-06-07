// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.IPSetScope;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIPSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIPSetPlainArgs Empty = new GetIPSetPlainArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="scope", required=true)
    private IPSetScope scope;

    public IPSetScope scope() {
        return this.scope;
    }

    private GetIPSetPlainArgs() {}

    private GetIPSetPlainArgs(GetIPSetPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIPSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIPSetPlainArgs $;

        public Builder() {
            $ = new GetIPSetPlainArgs();
        }

        public Builder(GetIPSetPlainArgs defaults) {
            $ = new GetIPSetPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder scope(IPSetScope scope) {
            $.scope = scope;
            return this;
        }

        public GetIPSetPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
