// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;Permission for the resource.&lt;/p&gt;
 * 
 */
public final class TemplateResourcePermission extends com.pulumi.resources.InvokeArgs {

    public static final TemplateResourcePermission Empty = new TemplateResourcePermission();

    /**
     * &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
     * 
     */
    @Import(name="actions", required=true)
    private List<String> actions;

    /**
     * @return &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
     * 
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:&lt;/p&gt;
     *         &lt;ul&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) &lt;/p&gt;
     *             &lt;/li&gt;
     *          &lt;/ul&gt;
     * 
     */
    @Import(name="principal", required=true)
    private String principal;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:&lt;/p&gt;
     *         &lt;ul&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) &lt;/p&gt;
     *             &lt;/li&gt;
     *          &lt;/ul&gt;
     * 
     */
    public String principal() {
        return this.principal;
    }

    private TemplateResourcePermission() {}

    private TemplateResourcePermission(TemplateResourcePermission $) {
        this.actions = $.actions;
        this.principal = $.principal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateResourcePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateResourcePermission $;

        public Builder() {
            $ = new TemplateResourcePermission();
        }

        public Builder(TemplateResourcePermission defaults) {
            $ = new TemplateResourcePermission(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param principal &lt;p&gt;The Amazon Resource Name (ARN) of the principal. This can be one of the
         *             following:&lt;/p&gt;
         *         &lt;ul&gt;
         *             &lt;li&gt;
         *                 &lt;p&gt;The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)&lt;/p&gt;
         *             &lt;/li&gt;
         *             &lt;li&gt;
         *                 &lt;p&gt;The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)&lt;/p&gt;
         *             &lt;/li&gt;
         *             &lt;li&gt;
         *                 &lt;p&gt;The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
         *                     ARN. Use this option only to share resources (templates) across AWS accounts.
         *                     (This is less common.) &lt;/p&gt;
         *             &lt;/li&gt;
         *          &lt;/ul&gt;
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            $.principal = principal;
            return this;
        }

        public TemplateResourcePermission build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            return $;
        }
    }

}
