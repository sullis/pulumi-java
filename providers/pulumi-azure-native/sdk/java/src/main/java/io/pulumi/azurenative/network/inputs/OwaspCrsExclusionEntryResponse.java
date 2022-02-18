// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Allow to exclude some variable satisfy the condition for the WAF check.
 * 
 */
public final class OwaspCrsExclusionEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final OwaspCrsExclusionEntryResponse Empty = new OwaspCrsExclusionEntryResponse();

    /**
     * The variable to be excluded.
     * 
     */
    @InputImport(name="matchVariable", required=true)
    private final String matchVariable;

    public String getMatchVariable() {
        return this.matchVariable;
    }

    /**
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
     */
    @InputImport(name="selector", required=true)
    private final String selector;

    public String getSelector() {
        return this.selector;
    }

    /**
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
     */
    @InputImport(name="selectorMatchOperator", required=true)
    private final String selectorMatchOperator;

    public String getSelectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    public OwaspCrsExclusionEntryResponse(
        String matchVariable,
        String selector,
        String selectorMatchOperator) {
        this.matchVariable = Objects.requireNonNull(matchVariable, "expected parameter 'matchVariable' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator, "expected parameter 'selectorMatchOperator' to be non-null");
    }

    private OwaspCrsExclusionEntryResponse() {
        this.matchVariable = null;
        this.selector = null;
        this.selectorMatchOperator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwaspCrsExclusionEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String matchVariable;
        private String selector;
        private String selectorMatchOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(OwaspCrsExclusionEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchVariable = defaults.matchVariable;
    	      this.selector = defaults.selector;
    	      this.selectorMatchOperator = defaults.selectorMatchOperator;
        }

        public Builder setMatchVariable(String matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setSelectorMatchOperator(String selectorMatchOperator) {
            this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator);
            return this;
        }

        public OwaspCrsExclusionEntryResponse build() {
            return new OwaspCrsExclusionEntryResponse(matchVariable, selector, selectorMatchOperator);
        }
    }
}
