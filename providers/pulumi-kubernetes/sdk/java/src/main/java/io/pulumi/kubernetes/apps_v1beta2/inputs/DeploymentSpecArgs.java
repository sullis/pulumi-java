// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apps_v1beta2.inputs.DeploymentStrategyArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 * 
 */
public final class DeploymentSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecArgs Empty = new DeploymentSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @Import(name="minReadySeconds")
      private final @Nullable Output<Integer> minReadySeconds;

    public Output<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Output.empty() : this.minReadySeconds;
    }

    /**
     * Indicates that the deployment is paused.
     * 
     */
    @Import(name="paused")
      private final @Nullable Output<Boolean> paused;

    public Output<Boolean> getPaused() {
        return this.paused == null ? Output.empty() : this.paused;
    }

    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    @Import(name="progressDeadlineSeconds")
      private final @Nullable Output<Integer> progressDeadlineSeconds;

    public Output<Integer> getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds == null ? Output.empty() : this.progressDeadlineSeconds;
    }

    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    @Import(name="replicas")
      private final @Nullable Output<Integer> replicas;

    public Output<Integer> getReplicas() {
        return this.replicas == null ? Output.empty() : this.replicas;
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
      private final @Nullable Output<Integer> revisionHistoryLimit;

    public Output<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Output.empty() : this.revisionHistoryLimit;
    }

    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
     * 
     */
    @Import(name="selector", required=true)
      private final Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> getSelector() {
        return this.selector;
    }

    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    @Import(name="strategy")
      private final @Nullable Output<DeploymentStrategyArgs> strategy;

    public Output<DeploymentStrategyArgs> getStrategy() {
        return this.strategy == null ? Output.empty() : this.strategy;
    }

    /**
     * Template describes the pods that will be created.
     * 
     */
    @Import(name="template", required=true)
      private final Output<PodTemplateSpecArgs> template;

    public Output<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    public DeploymentSpecArgs(
        @Nullable Output<Integer> minReadySeconds,
        @Nullable Output<Boolean> paused,
        @Nullable Output<Integer> progressDeadlineSeconds,
        @Nullable Output<Integer> replicas,
        @Nullable Output<Integer> revisionHistoryLimit,
        Output<LabelSelectorArgs> selector,
        @Nullable Output<DeploymentStrategyArgs> strategy,
        Output<PodTemplateSpecArgs> template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.strategy = strategy;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private DeploymentSpecArgs() {
        this.minReadySeconds = Output.empty();
        this.paused = Output.empty();
        this.progressDeadlineSeconds = Output.empty();
        this.replicas = Output.empty();
        this.revisionHistoryLimit = Output.empty();
        this.selector = Output.empty();
        this.strategy = Output.empty();
        this.template = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minReadySeconds;
        private @Nullable Output<Boolean> paused;
        private @Nullable Output<Integer> progressDeadlineSeconds;
        private @Nullable Output<Integer> replicas;
        private @Nullable Output<Integer> revisionHistoryLimit;
        private Output<LabelSelectorArgs> selector;
        private @Nullable Output<DeploymentStrategyArgs> strategy;
        private Output<PodTemplateSpecArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.paused = defaults.paused;
    	      this.progressDeadlineSeconds = defaults.progressDeadlineSeconds;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
    	      this.template = defaults.template;
        }

        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }
        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Output.ofNullable(minReadySeconds);
            return this;
        }
        public Builder paused(@Nullable Output<Boolean> paused) {
            this.paused = paused;
            return this;
        }
        public Builder paused(@Nullable Boolean paused) {
            this.paused = Output.ofNullable(paused);
            return this;
        }
        public Builder progressDeadlineSeconds(@Nullable Output<Integer> progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }
        public Builder progressDeadlineSeconds(@Nullable Integer progressDeadlineSeconds) {
            this.progressDeadlineSeconds = Output.ofNullable(progressDeadlineSeconds);
            return this;
        }
        public Builder replicas(@Nullable Output<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Output.ofNullable(replicas);
            return this;
        }
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }
        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Output.ofNullable(revisionHistoryLimit);
            return this;
        }
        public Builder selector(Output<LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public Builder selector(LabelSelectorArgs selector) {
            this.selector = Output.of(Objects.requireNonNull(selector));
            return this;
        }
        public Builder strategy(@Nullable Output<DeploymentStrategyArgs> strategy) {
            this.strategy = strategy;
            return this;
        }
        public Builder strategy(@Nullable DeploymentStrategyArgs strategy) {
            this.strategy = Output.ofNullable(strategy);
            return this;
        }
        public Builder template(Output<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder template(PodTemplateSpecArgs template) {
            this.template = Output.of(Objects.requireNonNull(template));
            return this;
        }        public DeploymentSpecArgs build() {
            return new DeploymentSpecArgs(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, selector, strategy, template);
        }
    }
}
