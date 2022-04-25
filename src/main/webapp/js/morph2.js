{
	const DOM = {};
	DOM.svg = document.querySelector('#morph2');
	DOM.shapeEl = DOM.svg.querySelector('#morph2 path');
	const shapes = [
		{
			path: 'M0,390h720c0,0-89.87-251.02-319.92-178.81c-147.65,46.34-92.63-63.02-220.42-76.64C51.87,120.93,166.65,0,0,0L0,390z',
			pathAlt: 'M0,390h720c0,0-80.19-299-301.28-181.14c-136.55,72.8-131.92-40.12-259.89-51.98C8.75,142.97,177.86,16.32,0,0L0,390z',
			scaleX: 1,
			scaleY: 1,
			rotate: 0,
			tx: 0,
			ty: 0,
			fill: {
				color: '#00baff',
				duration: 500,
				easing: 'linear'
			},
			animation: {
				path: {
					duration: 3000,
					easing: 'easeOutElastic',
					elasticity: 600
				},
				svg: {
					duration: 2000,
					easing: 'easeOutElastic'
				}
			}
		}
	];
	let step;

	const initShapeLoop = function(pos) {
		pos = pos || 0;
		anime.remove(DOM.shapeEl);
		anime({
			targets: DOM.shapeEl,
			easing: 'linear',
			d: [{value: shapes[pos].pathAlt, duration:3500}, {value: shapes[pos].path, duration:3500}],
			loop: true,
			fill: {
				value: shapes[pos].fill.color,
				duration: shapes[pos].fill.duration,
				easing: shapes[pos].fill.easing
			},
			direction: 'alternate'
		});
	};

	const initShapeEl = function() {
		anime.remove(DOM.svg);
		anime({
			targets: DOM.svg,
			duration: 1,
			easing: 'linear',
			scaleX: shapes[0].scaleX,
			scaleY: shapes[0].scaleY,
			translateX: shapes[0].tx+'px',
			translateY: shapes[0].ty+'px',
			rotate: shapes[0].rotate+'deg'
		});

		initShapeLoop();
	};

	const init = function() {
		imagesLoaded(document.body, () => {
			initShapeEl();
		});
	}

	init();
};