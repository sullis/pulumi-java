// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A condition to be met.
 * 
 */
public final class ConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConditionResponse Empty = new ConditionResponse();

    /**
     * Trusted attributes supplied by the IAM system.
     * 
     */
    @Import(name="iam", required=true)
    private String iam;

    /**
     * @return Trusted attributes supplied by the IAM system.
     * 
     */
    public String iam() {
        return this.iam;
    }

    /**
     * An operator to apply the subject with.
     * 
     */
    @Import(name="op", required=true)
    private String op;

    /**
     * @return An operator to apply the subject with.
     * 
     */
    public String op() {
        return this.op;
    }

    /**
     * Trusted attributes discharged by the service.
     * 
     */
    @Import(name="svc", required=true)
    private String svc;

    /**
     * @return Trusted attributes discharged by the service.
     * 
     */
    public String svc() {
        return this.svc;
    }

    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    @Import(name="sys", required=true)
    private String sys;

    /**
     * @return Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    public String sys() {
        return this.sys;
    }

    /**
     * The objects of the condition.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The objects of the condition.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private ConditionResponse() {}

    private ConditionResponse(ConditionResponse $) {
        this.iam = $.iam;
        this.op = $.op;
        this.svc = $.svc;
        this.sys = $.sys;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionResponse $;

        public Builder() {
            $ = new ConditionResponse();
        }

        public Builder(ConditionResponse defaults) {
            $ = new ConditionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param iam Trusted attributes supplied by the IAM system.
         * 
         * @return builder
         * 
         */
        public Builder iam(String iam) {
            $.iam = iam;
            return this;
        }

        /**
         * @param op An operator to apply the subject with.
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            $.op = op;
            return this;
        }

        /**
         * @param svc Trusted attributes discharged by the service.
         * 
         * @return builder
         * 
         */
        public Builder svc(String svc) {
            $.svc = svc;
            return this;
        }

        /**
         * @param sys Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
         * 
         * @return builder
         * 
         */
        public Builder sys(String sys) {
            $.sys = sys;
            return this;
        }

        /**
         * @param values The objects of the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The objects of the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ConditionResponse build() {
            $.iam = Objects.requireNonNull($.iam, "expected parameter 'iam' to be non-null");
            $.op = Objects.requireNonNull($.op, "expected parameter 'op' to be non-null");
            $.svc = Objects.requireNonNull($.svc, "expected parameter 'svc' to be non-null");
            $.sys = Objects.requireNonNull($.sys, "expected parameter 'sys' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
