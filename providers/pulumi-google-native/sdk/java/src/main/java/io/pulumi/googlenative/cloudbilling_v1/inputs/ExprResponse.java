// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbilling_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec. Example (Comparison): title: "Summary size limit" description: "Determines if a summary is less than 100 chars" expression: "document.summary.size() < 100" Example (Equality): title: "Requestor is owner" description: "Determines if requestor is the document owner" expression: "document.owner == request.auth.claims.email" Example (Logic): title: "Public documents" description: "Determine whether the document should be publicly visible" expression: "document.type != 'private' && document.type != 'internal'" Example (Data Manipulation): title: "Notification string" description: "Create a notification string with a timestamp." expression: "'New message received at ' + string(document.create_time)" The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.
 * 
 */
public final class ExprResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExprResponse Empty = new ExprResponse();

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
      private final String expression;

    public String getExpression() {
        return this.expression;
    }

    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public ExprResponse(
        String description,
        String expression,
        String location,
        String title) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private ExprResponse() {
        this.description = null;
        this.expression = null;
        this.location = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExprResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expression;
        private String location;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ExprResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public ExprResponse build() {
            return new ExprResponse(description, expression, location, title);
        }
    }
}
