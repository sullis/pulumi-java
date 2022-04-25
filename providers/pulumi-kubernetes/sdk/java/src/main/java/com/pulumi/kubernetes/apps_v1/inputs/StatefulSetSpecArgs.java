// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps_v1.inputs.StatefulSetPersistentVolumeClaimRetentionPolicyArgs;
import com.pulumi.kubernetes.apps_v1.inputs.StatefulSetUpdateStrategyArgs;
import com.pulumi.kubernetes.core_v1.inputs.PersistentVolumeClaimArgs;
import com.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 * 
 */
public final class StatefulSetSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetSpecArgs Empty = new StatefulSetSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.
     * 
     */
    @Import(name="minReadySeconds")
    private @Nullable Output<Integer> minReadySeconds;

    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.
     * 
     */
    public Optional<Output<Integer>> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }

    /**
     * persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
     * 
     */
    @Import(name="persistentVolumeClaimRetentionPolicy")
    private @Nullable Output<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> persistentVolumeClaimRetentionPolicy;

    /**
     * @return persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
     * 
     */
    public Optional<Output<StatefulSetPersistentVolumeClaimRetentionPolicyArgs>> persistentVolumeClaimRetentionPolicy() {
        return Optional.ofNullable(this.persistentVolumeClaimRetentionPolicy);
    }

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     * Possible enum values:
     *  - `&#34;OrderedReady&#34;` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
     *  - `&#34;Parallel&#34;` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
     * 
     */
    @Import(name="podManagementPolicy")
    private @Nullable Output<String> podManagementPolicy;

    /**
     * @return podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     * Possible enum values:
     *  - `&#34;OrderedReady&#34;` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
     *  - `&#34;Parallel&#34;` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
     * 
     */
    public Optional<Output<String>> podManagementPolicy() {
        return Optional.ofNullable(this.podManagementPolicy);
    }

    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    /**
     * @return replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    /**
     * @return revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    /**
     * selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector", required=true)
    private Output<LabelSelectorArgs> selector;

    /**
     * @return selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Output<LabelSelectorArgs> selector() {
        return this.selector;
    }

    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    @Import(name="template", required=true)
    private Output<PodTemplateSpecArgs> template;

    /**
     * @return template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    public Output<PodTemplateSpecArgs> template() {
        return this.template;
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<StatefulSetUpdateStrategyArgs> updateStrategy;

    /**
     * @return updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    public Optional<Output<StatefulSetUpdateStrategyArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    @Import(name="volumeClaimTemplates")
    private @Nullable Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates;

    /**
     * @return volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    public Optional<Output<List<PersistentVolumeClaimArgs>>> volumeClaimTemplates() {
        return Optional.ofNullable(this.volumeClaimTemplates);
    }

    private StatefulSetSpecArgs() {}

    private StatefulSetSpecArgs(StatefulSetSpecArgs $) {
        this.minReadySeconds = $.minReadySeconds;
        this.persistentVolumeClaimRetentionPolicy = $.persistentVolumeClaimRetentionPolicy;
        this.podManagementPolicy = $.podManagementPolicy;
        this.replicas = $.replicas;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.selector = $.selector;
        this.serviceName = $.serviceName;
        this.template = $.template;
        this.updateStrategy = $.updateStrategy;
        this.volumeClaimTemplates = $.volumeClaimTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetSpecArgs $;

        public Builder() {
            $ = new StatefulSetSpecArgs();
        }

        public Builder(StatefulSetSpecArgs defaults) {
            $ = new StatefulSetSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            $.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(Integer minReadySeconds) {
            return minReadySeconds(Output.of(minReadySeconds));
        }

        /**
         * @param persistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
         * 
         * @return builder
         * 
         */
        public Builder persistentVolumeClaimRetentionPolicy(@Nullable Output<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> persistentVolumeClaimRetentionPolicy) {
            $.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
            return this;
        }

        /**
         * @param persistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
         * 
         * @return builder
         * 
         */
        public Builder persistentVolumeClaimRetentionPolicy(StatefulSetPersistentVolumeClaimRetentionPolicyArgs persistentVolumeClaimRetentionPolicy) {
            return persistentVolumeClaimRetentionPolicy(Output.of(persistentVolumeClaimRetentionPolicy));
        }

        /**
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * 
         * Possible enum values:
         *  - `&#34;OrderedReady&#34;` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
         *  - `&#34;Parallel&#34;` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
         * 
         * @return builder
         * 
         */
        public Builder podManagementPolicy(@Nullable Output<String> podManagementPolicy) {
            $.podManagementPolicy = podManagementPolicy;
            return this;
        }

        /**
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * 
         * Possible enum values:
         *  - `&#34;OrderedReady&#34;` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
         *  - `&#34;Parallel&#34;` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
         * 
         * @return builder
         * 
         */
        public Builder podManagementPolicy(String podManagementPolicy) {
            return podManagementPolicy(Output.of(podManagementPolicy));
        }

        /**
         * @param replicas replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        /**
         * @param selector selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<PodTemplateSpecArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
         * 
         * @return builder
         * 
         */
        public Builder template(PodTemplateSpecArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(@Nullable Output<StatefulSetUpdateStrategyArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(StatefulSetUpdateStrategyArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(@Nullable Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates) {
            $.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(List<PersistentVolumeClaimArgs> volumeClaimTemplates) {
            return volumeClaimTemplates(Output.of(volumeClaimTemplates));
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(PersistentVolumeClaimArgs... volumeClaimTemplates) {
            return volumeClaimTemplates(List.of(volumeClaimTemplates));
        }

        public StatefulSetSpecArgs build() {
            $.selector = Objects.requireNonNull($.selector, "expected parameter 'selector' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}
