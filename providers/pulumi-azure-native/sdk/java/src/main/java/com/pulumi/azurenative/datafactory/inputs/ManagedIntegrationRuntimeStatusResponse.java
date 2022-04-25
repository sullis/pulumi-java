// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ManagedIntegrationRuntimeErrorResponse;
import com.pulumi.azurenative.datafactory.inputs.ManagedIntegrationRuntimeNodeResponse;
import com.pulumi.azurenative.datafactory.inputs.ManagedIntegrationRuntimeOperationResultResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Managed integration runtime status.
 * 
 */
public final class ManagedIntegrationRuntimeStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeStatusResponse Empty = new ManagedIntegrationRuntimeStatusResponse();

    /**
     * The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    /**
     * @return The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    public String createTime() {
        return this.createTime;
    }

    /**
     * The data factory name which the integration runtime belong to.
     * 
     */
    @Import(name="dataFactoryName", required=true)
    private String dataFactoryName;

    /**
     * @return The data factory name which the integration runtime belong to.
     * 
     */
    public String dataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * The last operation result that occurred on this integration runtime.
     * 
     */
    @Import(name="lastOperation", required=true)
    private ManagedIntegrationRuntimeOperationResultResponse lastOperation;

    /**
     * @return The last operation result that occurred on this integration runtime.
     * 
     */
    public ManagedIntegrationRuntimeOperationResultResponse lastOperation() {
        return this.lastOperation;
    }

    /**
     * The list of nodes for managed integration runtime.
     * 
     */
    @Import(name="nodes", required=true)
    private List<ManagedIntegrationRuntimeNodeResponse> nodes;

    /**
     * @return The list of nodes for managed integration runtime.
     * 
     */
    public List<ManagedIntegrationRuntimeNodeResponse> nodes() {
        return this.nodes;
    }

    /**
     * The errors that occurred on this integration runtime.
     * 
     */
    @Import(name="otherErrors", required=true)
    private List<ManagedIntegrationRuntimeErrorResponse> otherErrors;

    /**
     * @return The errors that occurred on this integration runtime.
     * 
     */
    public List<ManagedIntegrationRuntimeErrorResponse> otherErrors() {
        return this.otherErrors;
    }

    /**
     * The state of integration runtime.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return The state of integration runtime.
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * The type of integration runtime.
     * Expected value is &#39;Managed&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of integration runtime.
     * Expected value is &#39;Managed&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private ManagedIntegrationRuntimeStatusResponse() {}

    private ManagedIntegrationRuntimeStatusResponse(ManagedIntegrationRuntimeStatusResponse $) {
        this.createTime = $.createTime;
        this.dataFactoryName = $.dataFactoryName;
        this.lastOperation = $.lastOperation;
        this.nodes = $.nodes;
        this.otherErrors = $.otherErrors;
        this.state = $.state;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedIntegrationRuntimeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedIntegrationRuntimeStatusResponse $;

        public Builder() {
            $ = new ManagedIntegrationRuntimeStatusResponse();
        }

        public Builder(ManagedIntegrationRuntimeStatusResponse defaults) {
            $ = new ManagedIntegrationRuntimeStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time at which the integration runtime was created, in ISO8601 format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param dataFactoryName The data factory name which the integration runtime belong to.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryName(String dataFactoryName) {
            $.dataFactoryName = dataFactoryName;
            return this;
        }

        /**
         * @param lastOperation The last operation result that occurred on this integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder lastOperation(ManagedIntegrationRuntimeOperationResultResponse lastOperation) {
            $.lastOperation = lastOperation;
            return this;
        }

        /**
         * @param nodes The list of nodes for managed integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<ManagedIntegrationRuntimeNodeResponse> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes The list of nodes for managed integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder nodes(ManagedIntegrationRuntimeNodeResponse... nodes) {
            return nodes(List.of(nodes));
        }

        /**
         * @param otherErrors The errors that occurred on this integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder otherErrors(List<ManagedIntegrationRuntimeErrorResponse> otherErrors) {
            $.otherErrors = otherErrors;
            return this;
        }

        /**
         * @param otherErrors The errors that occurred on this integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder otherErrors(ManagedIntegrationRuntimeErrorResponse... otherErrors) {
            return otherErrors(List.of(otherErrors));
        }

        /**
         * @param state The state of integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param type The type of integration runtime.
         * Expected value is &#39;Managed&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ManagedIntegrationRuntimeStatusResponse build() {
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.dataFactoryName = Objects.requireNonNull($.dataFactoryName, "expected parameter 'dataFactoryName' to be non-null");
            $.lastOperation = Objects.requireNonNull($.lastOperation, "expected parameter 'lastOperation' to be non-null");
            $.nodes = Objects.requireNonNull($.nodes, "expected parameter 'nodes' to be non-null");
            $.otherErrors = Objects.requireNonNull($.otherErrors, "expected parameter 'otherErrors' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
