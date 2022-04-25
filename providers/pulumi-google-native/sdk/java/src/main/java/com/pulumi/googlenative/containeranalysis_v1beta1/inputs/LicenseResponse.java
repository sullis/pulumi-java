// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * License information: https://spdx.github.io/spdx-spec/3-package-information/#315-declared-license
 * 
 */
public final class LicenseResponse extends com.pulumi.resources.InvokeArgs {

    public static final LicenseResponse Empty = new LicenseResponse();

    /**
     * Comments
     * 
     */
    @Import(name="comments", required=true)
    private String comments;

    /**
     * @return Comments
     * 
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
     */
    @Import(name="expression", required=true)
    private String expression;

    /**
     * @return Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
     */
    public String expression() {
        return this.expression;
    }

    private LicenseResponse() {}

    private LicenseResponse(LicenseResponse $) {
        this.comments = $.comments;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseResponse $;

        public Builder() {
            $ = new LicenseResponse();
        }

        public Builder(LicenseResponse defaults) {
            $ = new LicenseResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param comments Comments
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param expression Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public LicenseResponse build() {
            $.comments = Objects.requireNonNull($.comments, "expected parameter 'comments' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
