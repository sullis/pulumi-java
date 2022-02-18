// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.OperationsDefinitionDisplayArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of an Operation.
 * 
 */
public final class OperationsDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OperationsDefinitionArgs Empty = new OperationsDefinitionArgs();

    @InputImport(name="actionType")
    private final @Nullable Input<String> actionType;

    public Input<String> getActionType() {
        return this.actionType == null ? Input.empty() : this.actionType;
    }

    /**
     * Display information of the operation.
     * 
     */
    @InputImport(name="display", required=true)
    private final Input<OperationsDefinitionDisplayArgs> display;

    public Input<OperationsDefinitionDisplayArgs> getDisplay() {
        return this.display;
    }

    /**
     * Indicates whether the operation applies to data-plane.
     * 
     */
    @InputImport(name="isDataAction")
    private final @Nullable Input<Boolean> isDataAction;

    public Input<Boolean> getIsDataAction() {
        return this.isDataAction == null ? Input.empty() : this.isDataAction;
    }

    /**
     * Name of the operation.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="origin")
    private final @Nullable Input<String> origin;

    public Input<String> getOrigin() {
        return this.origin == null ? Input.empty() : this.origin;
    }

    @InputImport(name="properties")
    private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public OperationsDefinitionArgs(
        @Nullable Input<String> actionType,
        Input<OperationsDefinitionDisplayArgs> display,
        @Nullable Input<Boolean> isDataAction,
        Input<String> name,
        @Nullable Input<String> origin,
        @Nullable Input<Object> properties) {
        this.actionType = actionType;
        this.display = Objects.requireNonNull(display, "expected parameter 'display' to be non-null");
        this.isDataAction = isDataAction;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.origin = origin;
        this.properties = properties;
    }

    private OperationsDefinitionArgs() {
        this.actionType = Input.empty();
        this.display = Input.empty();
        this.isDataAction = Input.empty();
        this.name = Input.empty();
        this.origin = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationsDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionType;
        private Input<OperationsDefinitionDisplayArgs> display;
        private @Nullable Input<Boolean> isDataAction;
        private Input<String> name;
        private @Nullable Input<String> origin;
        private @Nullable Input<Object> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationsDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.display = defaults.display;
    	      this.isDataAction = defaults.isDataAction;
    	      this.name = defaults.name;
    	      this.origin = defaults.origin;
    	      this.properties = defaults.properties;
        }

        public Builder setActionType(@Nullable Input<String> actionType) {
            this.actionType = actionType;
            return this;
        }

        public Builder setActionType(@Nullable String actionType) {
            this.actionType = Input.ofNullable(actionType);
            return this;
        }

        public Builder setDisplay(Input<OperationsDefinitionDisplayArgs> display) {
            this.display = Objects.requireNonNull(display);
            return this;
        }

        public Builder setDisplay(OperationsDefinitionDisplayArgs display) {
            this.display = Input.of(Objects.requireNonNull(display));
            return this;
        }

        public Builder setIsDataAction(@Nullable Input<Boolean> isDataAction) {
            this.isDataAction = isDataAction;
            return this;
        }

        public Builder setIsDataAction(@Nullable Boolean isDataAction) {
            this.isDataAction = Input.ofNullable(isDataAction);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOrigin(@Nullable Input<String> origin) {
            this.origin = origin;
            return this;
        }

        public Builder setOrigin(@Nullable String origin) {
            this.origin = Input.ofNullable(origin);
            return this;
        }

        public Builder setProperties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public OperationsDefinitionArgs build() {
            return new OperationsDefinitionArgs(actionType, display, isDataAction, name, origin, properties);
        }
    }
}
