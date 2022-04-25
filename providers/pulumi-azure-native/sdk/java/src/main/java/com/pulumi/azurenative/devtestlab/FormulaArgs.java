// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab;

import com.pulumi.azurenative.devtestlab.inputs.FormulaPropertiesFromVmArgs;
import com.pulumi.azurenative.devtestlab.inputs.LabVirtualMachineCreationParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FormulaArgs extends com.pulumi.resources.ResourceArgs {

    public static final FormulaArgs Empty = new FormulaArgs();

    /**
     * The description of the formula.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the formula.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The content of the formula.
     * 
     */
    @Import(name="formulaContent")
    private @Nullable Output<LabVirtualMachineCreationParameterArgs> formulaContent;

    /**
     * @return The content of the formula.
     * 
     */
    public Optional<Output<LabVirtualMachineCreationParameterArgs>> formulaContent() {
        return Optional.ofNullable(this.formulaContent);
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private Output<String> labName;

    /**
     * @return The name of the lab.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the formula.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the formula.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The OS type of the formula.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    /**
     * @return The OS type of the formula.
     * 
     */
    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Information about a VM from which a formula is to be created.
     * 
     */
    @Import(name="vm")
    private @Nullable Output<FormulaPropertiesFromVmArgs> vm;

    /**
     * @return Information about a VM from which a formula is to be created.
     * 
     */
    public Optional<Output<FormulaPropertiesFromVmArgs>> vm() {
        return Optional.ofNullable(this.vm);
    }

    private FormulaArgs() {}

    private FormulaArgs(FormulaArgs $) {
        this.description = $.description;
        this.formulaContent = $.formulaContent;
        this.labName = $.labName;
        this.location = $.location;
        this.name = $.name;
        this.osType = $.osType;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.vm = $.vm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FormulaArgs $;

        public Builder() {
            $ = new FormulaArgs();
        }

        public Builder(FormulaArgs defaults) {
            $ = new FormulaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the formula.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the formula.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param formulaContent The content of the formula.
         * 
         * @return builder
         * 
         */
        public Builder formulaContent(@Nullable Output<LabVirtualMachineCreationParameterArgs> formulaContent) {
            $.formulaContent = formulaContent;
            return this;
        }

        /**
         * @param formulaContent The content of the formula.
         * 
         * @return builder
         * 
         */
        public Builder formulaContent(LabVirtualMachineCreationParameterArgs formulaContent) {
            return formulaContent(Output.of(formulaContent));
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the formula.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the formula.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osType The OS type of the formula.
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The OS type of the formula.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vm Information about a VM from which a formula is to be created.
         * 
         * @return builder
         * 
         */
        public Builder vm(@Nullable Output<FormulaPropertiesFromVmArgs> vm) {
            $.vm = vm;
            return this;
        }

        /**
         * @param vm Information about a VM from which a formula is to be created.
         * 
         * @return builder
         * 
         */
        public Builder vm(FormulaPropertiesFromVmArgs vm) {
            return vm(Output.of(vm));
        }

        public FormulaArgs build() {
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
