// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.IPSetScope;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIPSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIPSetArgs Empty = new GetIPSetArgs();

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
    private final IPSetScope scope;

    public IPSetScope getScope() {
        return this.scope;
    }

    public GetIPSetArgs(
        String id,
        String name,
        IPSetScope scope) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetIPSetArgs() {
        this.id = null;
        this.name = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private IPSetScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPSetArgs defaults) {
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

        public Builder setScope(IPSetScope scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetIPSetArgs build() {
            return new GetIPSetArgs(id, name, scope);
        }
    }
}
