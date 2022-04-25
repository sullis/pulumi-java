// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.inputs.ConditionsResponse;
import com.pulumi.azurenative.alertsmanagement.inputs.ScopeResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action rule with action group configuration
 * 
 */
public final class ActionGroupResponse extends com.pulumi.resources.InvokeArgs {

    public static final ActionGroupResponse Empty = new ActionGroupResponse();

    /**
     * Action group to trigger if action rule matches
     * 
     */
    @Import(name="actionGroupId", required=true)
    private String actionGroupId;

    /**
     * @return Action group to trigger if action rule matches
     * 
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * conditions on which alerts will be filtered
     * 
     */
    @Import(name="conditions")
    private @Nullable ConditionsResponse conditions;

    /**
     * @return conditions on which alerts will be filtered
     * 
     */
    public Optional<ConditionsResponse> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @Import(name="createdAt", required=true)
    private String createdAt;

    /**
     * @return Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Created by user name.
     * 
     */
    @Import(name="createdBy", required=true)
    private String createdBy;

    /**
     * @return Created by user name.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Description of action rule
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of action rule
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @Import(name="lastModifiedAt", required=true)
    private String lastModifiedAt;

    /**
     * @return Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Last modified by user name.
     * 
     */
    @Import(name="lastModifiedBy", required=true)
    private String lastModifiedBy;

    /**
     * @return Last modified by user name.
     * 
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * scope on which action rule will apply
     * 
     */
    @Import(name="scope")
    private @Nullable ScopeResponse scope;

    /**
     * @return scope on which action rule will apply
     * 
     */
    public Optional<ScopeResponse> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Indicates if the given action rule is enabled or disabled
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Indicates type of action rule
     * Expected value is &#39;ActionGroup&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Indicates type of action rule
     * Expected value is &#39;ActionGroup&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private ActionGroupResponse() {}

    private ActionGroupResponse(ActionGroupResponse $) {
        this.actionGroupId = $.actionGroupId;
        this.conditions = $.conditions;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.scope = $.scope;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupResponse $;

        public Builder() {
            $ = new ActionGroupResponse();
        }

        public Builder(ActionGroupResponse defaults) {
            $ = new ActionGroupResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionGroupId Action group to trigger if action rule matches
         * 
         * @return builder
         * 
         */
        public Builder actionGroupId(String actionGroupId) {
            $.actionGroupId = actionGroupId;
            return this;
        }

        /**
         * @param conditions conditions on which alerts will be filtered
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable ConditionsResponse conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param createdAt Creation time of action rule. Date-Time in ISO-8601 format.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdBy Created by user name.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param description Description of action rule
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param lastModifiedAt Last updated time of action rule. Date-Time in ISO-8601 format.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(String lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        /**
         * @param lastModifiedBy Last modified by user name.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBy(String lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        /**
         * @param scope scope on which action rule will apply
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable ScopeResponse scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param status Indicates if the given action rule is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param type Indicates type of action rule
         * Expected value is &#39;ActionGroup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ActionGroupResponse build() {
            $.actionGroupId = Objects.requireNonNull($.actionGroupId, "expected parameter 'actionGroupId' to be non-null");
            $.createdAt = Objects.requireNonNull($.createdAt, "expected parameter 'createdAt' to be non-null");
            $.createdBy = Objects.requireNonNull($.createdBy, "expected parameter 'createdBy' to be non-null");
            $.lastModifiedAt = Objects.requireNonNull($.lastModifiedAt, "expected parameter 'lastModifiedAt' to be non-null");
            $.lastModifiedBy = Objects.requireNonNull($.lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
