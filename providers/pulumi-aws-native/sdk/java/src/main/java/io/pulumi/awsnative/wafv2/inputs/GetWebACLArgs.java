// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLScope;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebACLArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebACLArgs Empty = new GetWebACLArgs();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="scope", required=true)
    private final WebACLScope scope;

    public WebACLScope getScope() {
        return this.scope;
    }

    public GetWebACLArgs(
        String id,
        String name,
        WebACLScope scope) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetWebACLArgs() {
        this.id = null;
        this.name = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private WebACLScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScope(WebACLScope scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetWebACLArgs build() {
            return new GetWebACLArgs(id, name, scope);
        }
    }
}
