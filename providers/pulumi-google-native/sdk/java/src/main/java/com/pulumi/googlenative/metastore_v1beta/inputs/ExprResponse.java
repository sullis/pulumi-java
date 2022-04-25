// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec.Example (Comparison): title: &#34;Summary size limit&#34; description: &#34;Determines if a summary is less than 100 chars&#34; expression: &#34;document.summary.size() &lt; 100&#34; Example (Equality): title: &#34;Requestor is owner&#34; description: &#34;Determines if requestor is the document owner&#34; expression: &#34;document.owner == request.auth.claims.email&#34; Example (Logic): title: &#34;Public documents&#34; description: &#34;Determine whether the document should be publicly visible&#34; expression: &#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;&#34; Example (Data Manipulation): title: &#34;Notification string&#34; description: &#34;Create a notification string with a timestamp.&#34; expression: &#34;&#39;New message received at &#39; + string(document.create_time)&#34; The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.
 * 
 */
public final class ExprResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExprResponse Empty = new ExprResponse();

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
    private String expression;

    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @Import(name="title", required=true)
    private String title;

    /**
     * @return Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    public String title() {
        return this.title;
    }

    private ExprResponse() {}

    private ExprResponse(ExprResponse $) {
        this.description = $.description;
        this.expression = $.expression;
        this.location = $.location;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExprResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse $;

        public Builder() {
            $ = new ExprResponse();
        }

        public Builder(ExprResponse defaults) {
            $ = new ExprResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param location Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param title Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public ExprResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
