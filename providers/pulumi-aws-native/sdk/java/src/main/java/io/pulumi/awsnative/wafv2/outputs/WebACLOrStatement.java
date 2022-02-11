// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebACLOrStatement {
    private final List<WebACLStatement> statements;

    @OutputCustomType.Constructor({"statements"})
    private WebACLOrStatement(List<WebACLStatement> statements) {
        this.statements = Objects.requireNonNull(statements);
    }

    public List<WebACLStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebACLStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<WebACLStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public WebACLOrStatement build() {
            return new WebACLOrStatement(statements);
        }
    }
}
